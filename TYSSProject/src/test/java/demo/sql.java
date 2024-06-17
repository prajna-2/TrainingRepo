package demo;

public class sql {

	public static void main(String[] args) {
		String condition="Where project_name='FireFlink_69684';";
		String setValues="team_size=20";
		
		String tableName="project";
		String sql = "UPDATE " + tableName + " SET " + setValues + condition;
System.out.println(sql);
		
	}

}
