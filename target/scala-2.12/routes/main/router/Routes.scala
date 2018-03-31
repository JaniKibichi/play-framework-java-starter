// @GENERATOR:play-routes-compiler
// @SOURCE:/home/graham/code/playjava/conf/routes
// @DATE:Sat Mar 31 17:01:38 EAT 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  StudentController_2: controllers.StudentController,
  // @LINE:12
  HomeController_0: controllers.HomeController,
  // @LINE:15
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    StudentController_2: controllers.StudentController,
    // @LINE:12
    HomeController_0: controllers.HomeController,
    // @LINE:15
    Assets_1: controllers.Assets
  ) = this(errorHandler, StudentController_2, HomeController_0, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, StudentController_2, HomeController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.StudentController.listStudents()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """""" + "$" + """id<[^/]+>""", """controllers.StudentController.retrieve(id:Int)"""),
    ("""POST""", this.prefix, """controllers.StudentController.create()"""),
    ("""PUT""", this.prefix, """controllers.StudentController.update()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """""" + "$" + """id<[^/]+>""", """controllers.StudentController.delete(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home""", """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
  private[this] lazy val controllers_StudentController_listStudents0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_StudentController_listStudents0_invoker = createInvoker(
    StudentController_2.listStudents(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StudentController",
      "listStudents",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val controllers_StudentController_retrieve1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_StudentController_retrieve1_invoker = createInvoker(
    StudentController_2.retrieve(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StudentController",
      "retrieve",
      Seq(classOf[Int]),
      "POST",
      this.prefix + """""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_StudentController_create2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_StudentController_create2_invoker = createInvoker(
    StudentController_2.create(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StudentController",
      "create",
      Nil,
      "POST",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_StudentController_update3_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_StudentController_update3_invoker = createInvoker(
    StudentController_2.update(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StudentController",
      "update",
      Nil,
      "PUT",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_StudentController_delete4_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_StudentController_delete4_invoker = createInvoker(
    StudentController_2.delete(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StudentController",
      "delete",
      Seq(classOf[Int]),
      "DELETE",
      this.prefix + """""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_index5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home")))
  )
  private[this] lazy val controllers_HomeController_index5_invoker = createInvoker(
    HomeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """home""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Assets_versioned6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:5
    case controllers_StudentController_listStudents0_route(params@_) =>
      call { 
        controllers_StudentController_listStudents0_invoker.call(StudentController_2.listStudents())
      }
  
    // @LINE:6
    case controllers_StudentController_retrieve1_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_StudentController_retrieve1_invoker.call(StudentController_2.retrieve(id))
      }
  
    // @LINE:7
    case controllers_StudentController_create2_route(params@_) =>
      call { 
        controllers_StudentController_create2_invoker.call(StudentController_2.create())
      }
  
    // @LINE:8
    case controllers_StudentController_update3_route(params@_) =>
      call { 
        controllers_StudentController_update3_invoker.call(StudentController_2.update())
      }
  
    // @LINE:9
    case controllers_StudentController_delete4_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_StudentController_delete4_invoker.call(StudentController_2.delete(id))
      }
  
    // @LINE:12
    case controllers_HomeController_index5_route(params@_) =>
      call { 
        controllers_HomeController_index5_invoker.call(HomeController_0.index)
      }
  
    // @LINE:15
    case controllers_Assets_versioned6_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
