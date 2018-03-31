// @GENERATOR:play-routes-compiler
// @SOURCE:/home/graham/code/playjava/conf/routes
// @DATE:Sat Mar 31 17:01:38 EAT 2018


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
