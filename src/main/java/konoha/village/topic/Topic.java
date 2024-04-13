package konoha.village.topic;

import javax.persistence.Entity;
import javax.persistence.Id;
//import org.springframework.data.annotation.Id;




// Get /topics
// Get /topics/id

// Post /topics Creates a new topic
// Put /topics/id Updates the topic

// Delete / topics/id Deletes the topic

@Entity
public class Topic {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String name;
	private String description;
	
	public Topic() {
		
	}
	

	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	
	
	
}
