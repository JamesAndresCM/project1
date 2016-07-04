
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object error404_Scope0 {
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

class error404 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main()/*1.8*/{_display_(Seq[Any](format.raw/*1.9*/("""

"""),format.raw/*3.1*/("""<html>
<body>
<h1>Uh-oh. That wasn't found.</h1>

</body>
</html>
""")))}),format.raw/*9.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object error404 extends error404_Scope0.error404
              /*
                  -- GENERATED --
                  DATE: Mon Jul 04 06:55:07 CLT 2016
                  SOURCE: /home/snake/Descargas/playframework_projectos/project1/app/views/error404.scala.html
                  HASH: 186bc786c560a531880fd8ed57aba6855b27b24e
                  MATRIX: 833->1|846->7|883->8|911->10|1007->77
                  LINES: 32->1|32->1|32->1|34->3|40->9
                  -- GENERATED --
              */
          