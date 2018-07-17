$('#callLogin').click(() => {
    let ced = $('#ced').val();
    let pass = $('#pass').val();
    var xmlhttp = new XMLHttpRequest();
    xmlhttp.open('POST', 'http://localhost:8080/LoginService/LogInService', true);

    var sr =
            '<?xml version="1.0" encoding="utf-8"?>' +
            '<soapenv:Envelope ' +
            'xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" ' +
            'xmlns:ser="http://Service/">' +
            '<soapenv:Body>' +
            '<ser:LoginUsuario>' +
            '<ced>'+ced+'</ced>' +
            '<pass>'+pass+'</pass>' +
            '</ser:LoginUsuario>' +
            '</soapenv:Body>' +
            '</soapenv:Envelope>';

    xmlhttp.onreadystatechange = function () {
        if (xmlhttp.readyState == 4) {
            if (xmlhttp.status == 200) {
                let responseXML = xmlhttp.response;
                let response = $(responseXML).find('return')[0].innerText;
                if(response === 'true')
                    window.location.href = 'datos.jsp';
                else
                    $('#error').text('Contraseña o usuario incorrecto.');
            }
        }
    }
// Send the POST request
    xmlhttp.setRequestHeader('Content-Type', 'text/xml');
    xmlhttp.send(sr);
})