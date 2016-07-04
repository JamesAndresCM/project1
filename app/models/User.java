package models;
import javax.persistence.Entity;
import javax.persistence.Id;
import com.avaje.ebean.Model;


@Entity
public class User extends Model {

	@Id
	public Long id;
	public String nombre;
	public String email;
	public String telefono;

	public static Finder<Long, User> find = new Finder<Long, User>(
			Long.class, User.class);

}
