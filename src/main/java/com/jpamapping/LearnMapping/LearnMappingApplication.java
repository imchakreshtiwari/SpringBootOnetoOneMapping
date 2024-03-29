package com.jpamapping.LearnMapping;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpamapping.LearnMapping.Model.Gender;
import com.jpamapping.LearnMapping.Model.User;
import com.jpamapping.LearnMapping.Model.UserProfile;
import com.jpamapping.LearnMapping.repository.UserProfileRepository;
import com.jpamapping.LearnMapping.repository.UserRepository;

@SpringBootApplication
public class LearnMappingApplication {

	@Autowired 
	private UserRepository userRepository;

    @Autowired
    private UserProfileRepository userProfileRepository;
    
	public static void main(String[] args) {
		SpringApplication.run(LearnMappingApplication.class, args);
	}
	
		public void run(String... args) throws Exception {
        // Clean up database tables
        userProfileRepository.deleteAllInBatch();
        userRepository.deleteAllInBatch();
        
        User user = new User("Rajeev", "Singh", "rajeev@callicoder.com",
                "MY_SUPER_SECRET_PASSWORD");

        Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(1992, 7, 21);

        // Create a UserProfile instance
        UserProfile userProfile = new UserProfile("+91-8197882053", Gender.MALE, dateOfBirth.getTime(),
                "747", "2nd Cross", "Golf View Road, Kodihalli", "Bangalore",
                "Karnataka", "India", "560008");
        
     // Set child reference(userProfile) in parent entity(user)
        user.setUserProfile(userProfile);

        // Set parent reference(user) in child entity(userProfile)
        userProfile.setUser(user);

        // Save Parent Reference (which will save the child as well)
        userRepository.save(user);
		} 
}
