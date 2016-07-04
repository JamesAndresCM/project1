
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: Form[User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.24*/("""
"""),_display_(/*3.2*/main()/*3.8*/ {_display_(Seq[Any](format.raw/*3.10*/("""

  """),format.raw/*5.3*/("""<legend>Buscar Usuario</legend>
<div class="input-group">
  <input type="search" id="search" class="form-control" placeholder="Ingrese Nombre o telefono..." style="width:200%">
</div>
<br>
  <div class="panel panel-default" style="width:70%">
		<div class="panel-body">
			<fieldset>
				<div id="wrapper" class="row" style="overflow:scroll;height:97px;">
					<table id="datos-1" align="center" style="width:90%" class="table table-responsive table-condensed table-hover">
						<thead>
							<tr>
								<th>Id</th>
								<th>Nombre</th>
                <th>Email</th>
								<th>Telefono</th>
							</tr>
						</thead>
						<tbody id="users">
						</tbody>
					</table>
				</div>
			</fieldset>
		</div>
	</div>
	<div class="panel panel-default" style="width:40%">
		<div class="panel-body">
		<fieldset>
        	<legend>Crear Usuario</legend>
			<form action="" id="formDatos" name="formDatos">
				<div class="form-group">
					<table align="center" style="width:90%" class="table table-sm">
						<tr>
							<td><label>Nombre :</label></td>

							<td><input type="text" name="nombre" id="nombre" class="form-control" /></td>

  					</tr>
            <tr>
							<td><label>Email :</label></td>

							<td><input type="text" placeholder="example[at]gmail[dot]com" name="email" id="email"  class="form-control" /></td>

  					</tr>
            <tr>
							<td><label>Telefono :</label></td>

							<td><input type="text" placeholder="978XXXXXX" name="telefono" id="telefono"  class="form-control" /></td>

  					</tr>

					</table>
          <center><button type="submit" class="btn btn-success agregar">Enviar <span class="fa fa-arrow-right"></span></button></center>
				</div>
			</form>
			</fieldset>
		</div>
	</div>

""")))}),format.raw/*64.2*/("""
"""))
      }
    }
  }

  def render(userForm:Form[User]): play.twirl.api.HtmlFormat.Appendable = apply(userForm)

  def f:((Form[User]) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => apply(userForm)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Mon Jul 04 07:49:15 CLT 2016
                  SOURCE: /home/snake/Descargas/playframework_projectos/project1/app/views/index.scala.html
                  HASH: 00f35cfc00b8ea4e398a89960a3c72e16408a451
                  MATRIX: 749->1|881->23|908->42|921->48|960->50|990->54|2770->1804
                  LINES: 27->1|32->1|33->3|33->3|33->3|35->5|94->64
                  -- GENERATED --
              */
          