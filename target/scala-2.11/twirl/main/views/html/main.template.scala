
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(content:Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.18*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href=""""),_display_(/*9.18*/routes/*9.24*/.Assets.versioned("bower_components/bootstrap/dist/css/bootstrap.min.css")),format.raw/*9.98*/("""" rel="stylesheet">

    <link  type="text/css" href=""""),_display_(/*11.35*/routes/*11.41*/.Assets.versioned("bower_components/sweetalert/dist/sweetalert.css")),format.raw/*11.109*/("""" rel="stylesheet">
    <link  type="text/css" href=""""),_display_(/*12.35*/routes/*12.41*/.Assets.versioned("bower_components/sweetalert/themes/twitter/twitter.css")),format.raw/*12.116*/("""" rel="stylesheet">
  </head>
  <body>
    <nav class="navbar navbar-inverse"> <div class="container-fluid">
       <div class="navbar-header">
         <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-9" aria-expanded="false">
           <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span>
           <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button> <a class="navbar-brand" href="/#">Main</a> </div>
          <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-9">
            <ul class="nav navbar-nav"> <li class="active"><a href="/">Home</a></li>
             </ul>
           </div>
         </div>
       </nav>
       <div class="container">
         """),_display_(/*29.11*/content),format.raw/*29.18*/("""
       """),format.raw/*30.8*/("""</div>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src=""""),_display_(/*33.19*/routes/*33.25*/.Assets.versioned("bower_components/jquery/dist/jquery.min.js")),format.raw/*33.88*/(""""></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src=""""),_display_(/*35.19*/routes/*35.25*/.Assets.versioned("bower_components/bootstrap/dist/js/bootstrap.min.js")),format.raw/*35.97*/(""""></script>
    <script src=""""),_display_(/*36.19*/routes/*36.25*/.Assets.versioned("bower_components/sweetalert/dist/sweetalert.min.js")),format.raw/*36.96*/(""""></script>
    <!--scripts-->
    <script src=""""),_display_(/*38.19*/routes/*38.25*/.Assets.versioned("javascripts/test.js")),format.raw/*38.65*/(""""></script>
    <script src=""""),_display_(/*39.19*/routes/*39.25*/.Assets.versioned("javascripts/cuser.js")),format.raw/*39.66*/(""""></script>
  </body>
</html>
"""))
      }
    }
  }

  def render(content:Html): play.twirl.api.HtmlFormat.Appendable = apply()(content)

  def f:(() => (Html) => play.twirl.api.HtmlFormat.Appendable) = () => (content) => apply()(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Mon Jul 04 06:55:07 CLT 2016
                  SOURCE: /home/snake/Descargas/playframework_projectos/project1/app/views/main.scala.html
                  HASH: 3eb0eea9ce8224b0b156604a774ab263b6fbd411
                  MATRIX: 741->1|852->17|880->19|1123->236|1137->242|1231->316|1313->371|1328->377|1418->445|1499->499|1514->505|1611->580|2455->1397|2483->1404|2518->1412|2638->1505|2653->1511|2737->1574|2883->1693|2898->1699|2991->1771|3048->1801|3063->1807|3155->1878|3231->1927|3246->1933|3307->1973|3364->2003|3379->2009|3441->2050
                  LINES: 27->1|32->1|34->3|40->9|40->9|40->9|42->11|42->11|42->11|43->12|43->12|43->12|60->29|60->29|61->30|64->33|64->33|64->33|66->35|66->35|66->35|67->36|67->36|67->36|69->38|69->38|69->38|70->39|70->39|70->39
                  -- GENERATED --
              */
          