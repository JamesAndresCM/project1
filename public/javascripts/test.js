      var url = "/users";
      $.getJSON(url, function(data, status) {
          var users = data;
          for (var x in users) {
              var td1 = "<td>" + users[x].id + "</td>";
              var td2 = "<td>" + users[x].nombre + "</td>";
              var td3 = "<td>" + users[x].email + "</td>";
              var td4 = "<td>" + users[x].telefono + "</td>";
              var td5 = "<td><button data-valor='" + users[x].id + "' class='btn btn-danger quitar'>Eliminar</td>";
              var td6 = "<td><button data-valor='" + users[x].id + "' class='btn btn-primary editar'>Editar</td>";
              var row = "<tr>" + td1 + td2 + td3 + td4 + td5 + td6 + "</tr>";
              var tbody = $('#users');
              tbody.append(row);
          }

          $(document).on("keyup", "#search", function() {
              _this = this;
              $.each($("#users tr"), function() {
                  if ($(this).text().toLowerCase().indexOf($(_this).val().toLowerCase()) === -1)
                      $(this).hide();
                  else
                      $(this).show();
              });
          });


          $(document).on("click", ".quitar", function(event) {
              var url = "/user/delete/";
              var id = $(this).data("valor");
              if (confirm("Eliminar?")) {
                  $.ajax({
                      url: url + id,
                      dataType: 'json',
                      type: 'POST',
                  });
                  $(this).parent().parent().remove();
              }
          });
          /*swal({
            title: "Eliminar registro?",
            text: "Una vez eliminado no se podran revertir los cambios..",
            type: "warning",
            showCancelButton: true,
            confirmButtonColor: "#DD6B55",
            confirmButtonText: "Eliminar!",
            cancelButtonText: "Cancelar",
            closeOnConfirm: false,
            closeOnCancel: false
          }, function(isConfirm){
              if (isConfirm) {
                $.ajax({
                    url: url + id,
                    dataType: 'json',
                    type: 'POST'
                  });
                swal("Deleted!", "Registro eliminado con exito.", "success");

            } else {
                swal("Cancelled", "Se ha cancelado el proceso", "error");
            }
          });*/


          /*
          if (alert("Eliminar?")) {
              $.ajax({
                  url: url + id,
                  dataType: 'json',
                  type: 'POST'
              });
              $(this).parent().parent().remove();
          }
          */


          $(document).on("click", ".editar", function(event) {
              var url = "/user/update/";
              var id = $(this).data("valor");
              window.location.href = url + id;
          });
      });
