
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/snake/scripts_bash/project1/conf/routes
// @DATE:Mon Jul 04 09:43:47 CLT 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
