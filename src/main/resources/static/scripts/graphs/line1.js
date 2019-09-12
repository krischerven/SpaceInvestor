// colors: https://www.color-hex.com/color-palette/30647
let graph = {
		type: 'scatter',
		mode: 'lines',
		line: {
			color: "#145051",
			width: 5,
		},
};

graph.x = document.getElementById("xPoints_1").innerText.split(",");
graph.y = document.getElementById("yPoints_1").innerText.split(",");

for (let i = 0; i < graph.x.length; ++i) {
	graph.x[i] = "<span style=\"color: #145051\">" + graph.x[i] + "</span>"
	graph.y[i] = "<span style=\"color: #145051\">" + numeral(graph.y[i]).format('0a') + "</span>"
} 

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
layout.xaxis.title = "<span style=\"color: #145051\">" + document.getElementById("xName_1").innerText + "</span>";
layout.yaxis.title = "<span style=\"color: #145051\">" + document.getElementById("yName_1").innerText + "</span>";
Plotly.newPlot('graph1', [graph], layout);