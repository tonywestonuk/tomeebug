import javax.ejb.Singleton;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@ApplicationScoped
@Named("bugbean")
public class BugBean {
	public String getBugVal(){	
		return "bugval";
	}
}
