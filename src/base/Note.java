package base;
import java.util.Date;
import java.io.File;
public class Note {
	private Date date;
	private String title;
	
	public Note(String title){
		this.title = title;
		date = new Date();
	}
	public String getTitle(){
		return title;
	}
	public boolean equals(Note note){
		if(this.title == note.title)
			return true;
		return false;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Note other = (Note) obj;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
}



	
