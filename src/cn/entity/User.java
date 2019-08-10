package cn.entity;

import java.util.Date;

public class User {
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getUserRole() {
		return userRole;
	}

	public void setUserRole(int userRole) {
		this.userRole = userRole;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public int getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(int modifyBy) {
		this.modifyBy = modifyBy;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	private int id; // id
	private String userCode; // �û��ʱ�
	private String userName; // �û�����
	private String userPassword; // �û�����
	private int gender; // �Ա�
	private Date birthday; // ��������
	private String phone; // �绰
	private String address; // ��ַ
	private int userRole; // �û���ɫ
	private int createdBy; // ������
	private Date creationDate; // ����ʱ��
	private int modifyBy; // ������
	private Date modifyByDate; // ����ʱ��

	public Date getModifyByDate() {
		return modifyByDate;
	}

	public void setModifyByDate(Date modifyByDate) {
		this.modifyByDate = modifyByDate;
	}
}
