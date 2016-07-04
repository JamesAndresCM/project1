      function clearInput() {
          var nombre = $("#nombre").val('');
          var email = $("#email").val('');
          var telefono = $("#telefono").val('');
      }

      $(document).ready(function() {
          $(".agregar").click(function(e) {

              var nombre = $("#nombre").val();
              var email = $("#email").val();
              var telefono = $("#telefono").val();
              var emailReg = /^([\w-\.]+@([\w-]+\.)+[\w-]{2,4})?$/;
              var telefonoReg = /^([0-9]{2})+([0-9]{7})$/;

              if (nombre === '' || email === '' || telefono === '') {
                  alert("no pueden haber campos vacios...!!!!!!");
                  return false;
              } else if (!(email).match(emailReg)) {
                  alert("Email no valido...!!!!!!");
                  return false;
              } else if (!(telefono).match(telefonoReg)) {
                  alert("telefono no valido!!!");
                  return false;
              } else {
                  var postData = $("#formDatos").serialize();
                  if (confirm("Enviar datos?")) {
                      $.ajax({
                          type: "POST",
                          url: "/user",
                          data: postData,
                          dataType: 'json',
                          success: alert("datos enviados correctamente")
                      });
                  } else {
                      clearInput();
                      return false;
                  }
              }
          });
      });


      $(document).ready(function() {
          $(".update").click(function(e) {

              var nombre = $("#nombre").val();
              var email = $("#email").val();
              var telefono = $("#telefono").val();
              var emailReg = /^([\w-\.]+@([\w-]+\.)+[\w-]{2,4})?$/;
              var telefonoReg = /^([0-9]{2})+([0-9]{7})$/;

              if (nombre === '' || email === '' || telefono === '') {
                  alert("no pueden haber campos vacios...!!!!!!");
                  return false;
              } else if (!(email).match(emailReg)) {
                  alert("Email no valido...!!!!!!");
                  return false;
              } else if (!(telefono).match(telefonoReg)) {
                  alert("telefono no valido!!!");
                  return false;
              } else {
                  if (confirm("Actualizar datos?")) {
                      return true;
                  }
                  return false;
              }
          });
      });
