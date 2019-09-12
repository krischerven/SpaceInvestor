let graph = {
		type: 'scatter',
		mode: 'lines',
		line: {
			color: "#145051",
			width: 2,
		},
};

graph.x = document.getElementById("xPoints_1").innerText.split(",");
graph.y = document.getElementById("yPoints_1").innerText.split(",");

let layout = {
		title: 'ERROR',
		xaxis: {
			title: 'ERROR',
			showgrid: false,
			zeroline: false
		},
		yaxis: {
			title: 'ERROR',
			showline: false
		},
		plot_bgcolor: "#1c253c",
};

layout.title = document.getElementById("title_1").innerText
layout.xaxis.title = document.getElementById("xName_1").innerText
layout.yaxis.title = document.getElementById("yName_1").innerText

Plotly.newPlot('graph1', [graph], layout);