const path = require('path')
module.exports = {
	outputDir : path.resolve(__dirname, "../main/resources/static"),
	indexPath : "../static/index.html",
	devServer: {
		proxy: {
			'/': { 
				target:'http://localhost:12000',
				ws: true,
				changeOrigin: true
			},
		}
	}
}