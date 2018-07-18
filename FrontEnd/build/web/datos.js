let female;

$('#femenino').click(() => {    
    female = true;
    console.log('Click: ', female);
    $('#masculino').removeClass('selected');
    $('#femenino').addClass('selected');
});

$('#masculino').click(() => {
    female = false;
    console.log('Click: ', female);
    $('#femenino').removeClass('selected');
    $('#masculino').addClass('selected');
});


$('#imb').click(() => {
   let nacimiento = $('#nacimiento').val();
    let peso = $('#peso').val();
    var xmlhttp = new XMLHttpRequest();
    xmlhttp.open('POST', 'http://localhost:8080/IMBService/IMBService', true);
    var sr =
            '<?xml version="1.0" encoding="utf-8"?>' +
            '<soapenv:Envelope ' +
            'xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" '+
            'xmlns:ser="http://Service/">' +
            '<soapenv:Body>' +
            '<ser:IMB>' +
            '<nacimiento>'+nacimiento+'</nacimiento>' +
            '<fem>'+female+'</fem>' +
            '<peso>'+peso+'</peso>'+
            '</ser:IMB>' +
            '</soapenv:Body>' +
            '</soapenv:Envelope>';

    xmlhttp.onreadystatechange = function () {
        if (xmlhttp.readyState == 4) {
            if (xmlhttp.status == 200) {
                let responseXML = xmlhttp.response;
                let response = $(responseXML).find('return')[0].innerText;
                $('#IMBSpan').text(response);
                $('#resultadosIMB').removeClass('hiden');
                $('#resultadosIMB').addClass('visible');
            }
        }
    }
// Send the POST request
    xmlhttp.setRequestHeader('Content-Type', 'text/xml');
    xmlhttp.send(sr);
});
