// colors: https://www.color-hex.com/color-palette/30647
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

layout.title = "<span style=\"color: #145051\">" + document.getElementById("title_1").innerText + "</span>";
layout.xaxis.title = document.getElementById("xName_1").innerText
layout.yaxis.title = document.getElementById("yName_1").innerText
Plotly.newPlot('graph1', [graph], layout);