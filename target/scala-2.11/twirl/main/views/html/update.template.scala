
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object update_Scope0 {
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

class update extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Long,Form[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, userForm: Form[User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.34*/("""
"""),_display_(/*3.2*/main()/*3.8*/ {_display_(Seq[Any](format.raw/*3.10*/("""
  """),_display_(/*4.4*/form(routes.HomeController.updateUserPost(id))/*4.50*/ {_display_(Seq[Any](format.raw/*4.52*/("""
    """),_display_(/*5.6*/inputText(
        userForm("id"),
        'id -> "formDatos",
        'name -> "formDatos",
        '_label -> "",
        'style -> "display: none"
    )),format.raw/*11.6*/("""
    """),format.raw/*12.5*/("""<center>
	<div class="panel panel-default" style="width:35%">
		<div class="panel-body">
 			<fieldset>
        		<legend align="center">Update User</legend>
            <div class="col-xs-10">
					<table align="center" style="width:90%" class="table table table-responsive table-condensed">
						<tr>
						<td>"""),_display_(/*20.12*/inputText(userForm("Nombre"),
              'class ->  "form-control")),format.raw/*21.41*/("""
             """),format.raw/*22.14*/("""</td>
          </tr>
 						<tr>
              <td>
              """),_display_(/*26.16*/inputText(userForm("Email"),
              'id -> "email",
              '_label -> "email",
              'class ->  "form-control",
              'size -> 30)),format.raw/*30.27*/("""
						"""),format.raw/*31.7*/("""</td>
          </tr>
          <tr>
            <td>
            """),_display_(/*35.14*/inputText(userForm("Telefono"),
            'id -> "telefono",
            'class ->  "form-control")),format.raw/*37.39*/("""
          """),format.raw/*38.11*/("""</td>
        </tr>
					</table>
        </div>
			</fieldset>
		</div>
	</div>
  <input type="submit" value="Update User" style="margin-right: 40px;" class="btn btn-primary update">
  <a href=""""),_display_(/*46.13*/routes/*46.19*/.HomeController.index()),format.raw/*46.42*/("""" class="btn btn-info" role="button">Volver atras..</a></center>
	""")))}),format.raw/*47.3*/("""
""")))}),format.raw/*48.2*/("""
"""))
      }
    }
  }

  def render(id:Long,userForm:Form[User]): play.twirl.api.HtmlFormat.Appendable = apply(id,userForm)

  def f:((Long,Form[User]) => play.twirl.api.HtmlFormat.Appendable) = (id,userForm) => apply(id,userForm)

  def ref: this.type = this

}


}

/**/
object update extends update_Scope0.update
              /*
                  -- GENERATED --
                  DATE: Mon Jul 04 07:17:58 CLT 2016
                  SOURCE: /home/snake/Descargas/playframework_projectos/project1/app/views/update.scala.html
                  HASH: c5965787353d7f62e0d625802524aa449db6a945
                  MATRIX: 756->1|898->33|925->52|938->58|977->60|1006->64|1060->110|1099->112|1130->118|1305->273|1337->278|1679->593|1770->663|1812->677|1907->745|2088->905|2122->912|2216->979|2338->1080|2377->1091|2600->1287|2615->1293|2659->1316|2756->1383|2788->1385
                  LINES: 27->1|32->1|33->3|33->3|33->3|34->4|34->4|34->4|35->5|41->11|42->12|50->20|51->21|52->22|56->26|60->30|61->31|65->35|67->37|68->38|76->46|76->46|76->46|77->47|78->48
                  -- GENERATED --
              */
          