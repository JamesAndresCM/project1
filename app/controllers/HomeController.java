package controllers;
import com.fasterxml.jackson.databind.JsonNode;
import static play.data.Form.*;
import static play.libs.Json.*;
import play.mvc.*;
import views.html.*;
import java.util.List;
import models.User;
import play.data.Form;
import com.avaje.ebean.Model;

import static play.data.Form.form;




/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */

    public Result index() {
		      Form<User> userForm = form(User.class);
		      return ok(index.render(userForm));
	  }

    public Result saveUser() {

    	  User user = Form.form(User.class).bindFromRequest().get();
    		user.save();
    		return redirect(routes.HomeController.index());
    }

    public Result getUsers() {
    		@SuppressWarnings("unchecked")
    		List<User> user = new Model.Finder(String.class, User.class)
    				.all();
    		return ok(toJson(user));
  	}

    public Result deleteUser(Long id) {
		      User.find.ref(id).delete();
		      return redirect(routes.HomeController.index());
	  }


    public Result updateUserGet(Long id) {
		    Form<User> userForm = form(User.class).fill(
				User.find.byId(id));
		      return ok(update.render(id, userForm));
	   }

    public Result updateUserPost(Long id) {
      Form<User> userForm = form(User.class).bindFromRequest();
      userForm.get().update();
      return redirect(routes.HomeController.index());
	   }

}
