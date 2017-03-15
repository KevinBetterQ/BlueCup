package com.ccf.practice;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CCF20161203{
	
	
	private static List<Privi> priviList = new ArrayList<Privi>();
	private static List<Role> roleList = new ArrayList<Role>();
	private static List<User> userList = new ArrayList<User>();
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//input privilege list
		int p = scanner.nextInt();
		for(int i = 0; i < p; i++){
			priviList.add(new Privi(scanner.next()));
		}
		//input role list
		int r = scanner.nextInt();
		for(int i=0;i<r;i++){
			Role ro = new Role(scanner.next());
			int pn = scanner.nextInt();
			for(int j=0;j<pn;j++){
				ro.addPrivi(new Privi(scanner.next()));
			}
			roleList.add(ro);
		}
		//input user list
		int u = scanner.nextInt();
		for(int i = 0; i < u; i++){
			User us = new User(scanner.next());
			int rn = scanner.nextInt();
			for(int j = 0; j < rn; j++){
				us.addRole(roleFactory(scanner.next()));
			}
			userList.add(us);
		}
		//input query object
		int q = scanner.nextInt();
		List<Query> queryList = new ArrayList<Query>();
		for(int i = 0; i < q; i++){
			Query qu = new Query(scanner.next(), scanner.next());
			queryList.add(qu);
		}
		//query
		for(Query query : queryList){
			System.out.println(check(query));
			
		}
		scanner.close();
	}
	
	
	public static Role roleFactory(String name) {
		for(Role role : roleList){
			if(name.equals(role.getName())){
				return role;
			}
		}
		return null;
	}
	
	
	private static String check(Query query) {
		int flag = -3;
		for(User user : userList) {
			flag = -3;
			if(query.qUserName.equals(user.getName())){
				List<Role> userRoleList = user.getRoleList();
				for(Role role : userRoleList){
					List<Privi> userRolePriviList = role.getPriList();
					for(Privi privi : userRolePriviList){
						int temp = query.qPrivi.equals(privi);
						flag = (temp > flag) ? temp : flag;
						if(flag == -1) break;
					}
					if(flag == -1) break;
				}
			}
			if(flag!=-3){
				break;
			}
		}
		
		if(flag == -2 || flag == -3)
			return "false";
		else if (flag == -1) {
			return "true";
			
		}else{
			return flag + "";
		}
		
	}



	
	static class Query {
		public String qUserName;
		public Privi qPrivi;
		public Query() {
			qUserName = "";
			qPrivi = new Privi();
		}
		public Query(String usernamre, String priviname) {
			this.qUserName = usernamre;
			this.qPrivi = new Privi(priviname);
		}
		
	}
	
	
	static class Privi{
		private String name;
		private  int level;
		
		public Privi() {}
		
		public Privi(String per) {
			String[] p = per.split(":");
			if(p.length==1){
				name = p[0];
				level = -1;
			}else if(p.length==2){
				name = p[0];
				level = Integer.valueOf(p[1]);
			}
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getLevel() {
			return level;
		}

		public void setLevel(int level) {
			this.level = level;
		}
		
		
		public int equals(Privi p) {
			
			if(name.equals(p.getName())) {
				
				if ((level==-1)&&(level < p.getLevel())) {
					return p.getLevel();
				}else if (level == -1 && p.getLevel() == -1) {
					return -1;
				}else if (level!=-1 && level<=p.getLevel()) {
					return -1;
				}else{
					return -2;
				}
			}else{
				return -2;
			}
		}
		
	}
	

	static class Role{
		private String name;
		private List<Privi> priList;
		
		public Role() {
			this.name = "";
			this.priList = new ArrayList<Privi>();
		}
		
		public Role(String n) {
			this.name = n;
			this.priList = new ArrayList<Privi>();
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<Privi> getPriList() {
			return priList;
		}

		public void setPriList(List<Privi> priList) {
			this.priList = priList;
		}
		
		public void addPrivi(Privi p) {
			this.priList.add(p);
		}
		
		public int getPriviCount() {
			return this.priList.size();
		}
		
		
	}
	
	
	static class User{
		private String name;
		private List<Role> roleList;
		
		public User() {
			this.name = "";
			this.roleList = new ArrayList<Role>();
		}
		
		public User(String name) {
			this.name = name;
			this.roleList = new ArrayList<Role>();
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<Role> getRoleList() {
			return roleList;
		}

		public void setRoleList(List<Role> roleList) {
			this.roleList = roleList;
		}
		
		public void addRole(Role role) {
			this.roleList.add(role);
		}
		
		
	}
	
}