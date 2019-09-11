let graph = {
		type: 'scatter',
		mode: 'lines',
};

graph.x = document.getElementById("xPoints_1").innerText.split(",");
graph.y = document.getElementById("yPoints_1").innerText.split(",");

let layout = {
		title: 'Price Projections of Sending A Rocket To Mars',
		xaxis: {
			title: 'Year',
			showgrid: false,
			zeroline: false
		},
		yaxis: {
			title: 'Price (Billion $)',
			showline: false
		},
};

layout.title = document.getElementById("title_1").innerText
layout.xaxis.title = document.getElementById("xName_1").innerText
layout.yaxis.title = document.getElementById("yName_1").innerText

Plotly.newPlot('graph1', [graph], layout);