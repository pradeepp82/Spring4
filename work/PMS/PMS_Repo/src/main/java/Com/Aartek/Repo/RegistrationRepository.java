package Com.Aartek.Repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

 
import Com.Aartek.Model.User;
@Repository
public class RegistrationRepository {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	public User reg(User regist)   {
		System.out.println("inside Registration repo");
		System.out.println(regist.getName());
	
		
		 hibernateTemplate.saveOrUpdate(regist);
			
			return regist;
		
		 
		
	}
}
