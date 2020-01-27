package com.progmatic.snowball.entity;

// Generated 25.11.2015 12:01:36 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * UserPoint generated by hbm2java
 */
//@Entity
//@Table(name = "user_point", schema = "public")
//@SequenceGenerator(name="user_point_id_seq", sequenceName="user_point_id_seq", allocationSize=1)
//@Restrict
public class UserPoint implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private String name;
	private long userId;
	private User user;
	private String deviceid;
	private int pointType;
	private double latitude;
	private double longitude;
	private int elevation;
	private Date date;

	public UserPoint() {
	}

	public UserPoint(long id, String name, long userId, User user, String deviceid, int pointType,
			double latitude, double longitude, int elevation, Date date) {
		this.id = id;
		this.name = name;
		this.userId = userId;
		this.user = user;
		this.deviceid = deviceid;
		this.pointType = pointType;
		this.latitude = latitude;
		this.longitude = longitude;
		this.elevation = elevation;
		this.date = date;
	}

	//@Id
	//@Column(name = "id", unique = true, nullable = false)
 	//@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="user_point_id_seq")
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	//@Column(name = "name", nullable = false, length = 40)
	//@NotNull
	//@Size(max = 40)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//@Column(name = "user_id", insertable = false, updatable = false)
	public long getUserId() {
		return this.userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	//@Column(name = "deviceid", nullable = false, length = 40)
	//@NotNull
	//@Size(max = 40)
	public String getDeviceid() {
		return this.deviceid;
	}

	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}

	//@Column(name = "point_type", nullable = false)
	public int getPointType() {
		return this.pointType;
	}

	public void setPointType(int pointType) {
		this.pointType = pointType;
	}

	//@Column(name = "latitude", nullable = false, precision = 17, scale = 17)
	public double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	//@Column(name = "longitude", nullable = false, precision = 17, scale = 17)
	public double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	//@Column(name = "elevation", nullable = false)
	public int getElevation() {
		return this.elevation;
	}

	public void setElevation(int elevation) {
		this.elevation = elevation;
	}

	//@Temporal(TemporalType.TIMESTAMP)
	//@Column(name = "date", nullable = false, length = 29)
	//@NotNull
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	//@ManyToOne(fetch = FetchType.LAZY)
	//@JoinColumn(name = "user_id", nullable = false)
	//@NotNull
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String typeName()
	{
		String result = "";
		
		switch (this.getPointType())
		{
			case 1:
				result = "Type1";
				break;
			case 2:
				result = "Type2";
				break;
			case 3:
				result = "Type3";
				break;
		}
		
		return result;
	}

	public String color()
	{
		String result = "";
		
		switch (this.getPointType())
		{
			case 1:
				result = "#ff0000";
				break;
			case 2:
				result = "#00ff00";
				break;
			case 3:
				result = "#0000ff";
				break;
		}
		
		return result;
	}
}