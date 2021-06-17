package kodlamaio.northwind.business.abstracts;

import java.util.List;

import com.sun.net.httpserver.Authenticator.Result;

import kodlamaio.northwind.core.entities.User;
import kodlamaio.northwind.core.utilities.results.DataResult;

public interface UserService {
kodlamaio.northwind.core.utilities.results.Result add(User user);
DataResult<User>findByEmail(String email);
DataResult<List<User>> getAll();

}
