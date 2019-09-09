# POJO Fields:

'''
planetName
starName
publicationStatus
yearDiscovered
mass
massErrorMin
massErrorMax
radius
radiusErrorMin
radiusErrorMax
period
periodErrorMin
periodErrorMax
tempCalculated
tempMeasured
starDistance
starDistanceErrorMin
starDistanceErrorMax
inclination
inclinationErrorMin
'''

# rows we want
COLUMNS = (
    "target_name",
    "star_name",
    "publication_status",
    "discovered",
    "mass",
    "mass_error_min",
    "mass_error_max",
    "radius",
    "radius_error_min",
    "radius_error_max",
    "period",
    "period_error_min",
    "period_error_max",
   # "alt_target_name",
    "temp_calculated",
    "temp_measured",
    "star_distance",
    "star_distance_error_min",
    "star_distance_error_max",
    "inclination",
    "inclination_error_min",
    #"inclination_error_max",
    #"magnetic_field",
)

# start the MySQL database
import mysql.connector
database = mysql.connector.connect(
  host="localhost",
  user="root",
  passwd="Java2019",
  database="planet_db"
)

# get the MySQL cursor
cursor = database.cursor()

# feed the planets data into the MySQL database
import pyvo
service = pyvo.dal.TAPService("http://voparis-tap-planeto.obspm.fr/tap")
query = "SELECT * FROM exoplanet.epn_core ORDER BY mass DESC"
results = service.search(query)
for row in results:

    sql = """
    INSERT INTO exoplanets (planetName, starName, publicationStatus, yearDiscovered, 
    mass, massErrorMin, massErrorMax, radius, radiusErrorMin, radiusErrorMax, period, periodErrorMin, 
    periodErrorMax, tempCalculated, tempMeasured, starDistance, starDistanceErrorMin, starDistanceErrorMax, 
    inclination, inclinationErrorMin) VALUES (%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)
    """

    vals = [
        COLUMNS[0], COLUMNS[1], COLUMNS[2], COLUMNS[3], COLUMNS[4], COLUMNS[5], COLUMNS[6], COLUMNS[7], COLUMNS[8],
        COLUMNS[9], COLUMNS[10], COLUMNS[11], COLUMNS[12], COLUMNS[13], COLUMNS[14], COLUMNS[15], COLUMNS[16],
        COLUMNS[17], COLUMNS[18], COLUMNS[19],
    ]

    for i in range(len(vals)):
        tmp = row[vals[i]]
        if type(tmp) == bytes:
            tmp = tmp.decode()
        vals[i] = ("{}".format(tmp)).lower()
    cursor.execute(sql, vals)

database.commit()
