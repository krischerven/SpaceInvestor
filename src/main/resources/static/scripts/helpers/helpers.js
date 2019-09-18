function getCookie(name) {
	let value = "; " + document.cookie;
	let parts = value.split("; " + name + "=");
	if (parts.length == 2) return parts.pop().split(";").shift();
}

function seeHouses() {
	window.location='../see-houses?auth=' + getCookie("authenticated");
}