var express = require('express');

var app  = express();


app.get('/cheer.txt',function (req,res) {
	res.send('three cheers mate')
});

app.get('/jeer.txt',function (req,res){
	res.send('not great mate')
})

var server = app.listen(8080,function() {
	console.log('Listening on port 8080')
});