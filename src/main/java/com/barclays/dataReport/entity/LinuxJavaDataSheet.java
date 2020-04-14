package com.barclays.dataReport.entity;

import java.io.Serializable;
import java.util.Date;

import com.barclays.dataReport.util.JsonDateDeserializer;
import com.barclays.dataReport.util.JsonDateSerializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.OptBoolean;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class LinuxJavaDataSheet implements Serializable{

	private static final long serialVersionUID = -3357476016186717849L;
	
	private String platform;
	private String serverName;
	private String env;
	private String tc;
	private String service;
	private String itsi;
	private String rtbManager;
	private String rtbLead;
	private Boolean	isPrimary;
	private String javaLocation;
	private String javaClass;
	private String fileVersion;
	private int javaVersion;
	private String javaType;
	private String pbtCiName;
	@JsonDeserialize(using = JsonDateDeserializer.class)
	@JsonSerialize(using = JsonDateSerializer.class)
	@JsonFormat(pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date commandLastExecuted;
	private String dormancy;
	private int lowCritCount;
	private int medCritCount;
	private int highCritCount;
	private String utilityServer;
	private String utilityName;
	private String vendor;
	private String embeddedType;
	private String javaClass2;
	private String suspectedLatestJavaVersion;
	private String comments;
	private Date proposedDate;
	
	public LinuxJavaDataSheet() { //Default Constructor
		
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public String getEnv() {
		return env;
	}

	public void setEnv(String env) {
		this.env = env;
	}

	public String getTc() {
		return tc;
	}

	public void setTc(String tc) {
		this.tc = tc;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getItsi() {
		return itsi;
	}

	public void setItsi(String itsi) {
		this.itsi = itsi;
	}

	public String getRtbManager() {
		return rtbManager;
	}

	public void setRtbManager(String rtbManager) {
		this.rtbManager = rtbManager;
	}

	public String getRtbLead() {
		return rtbLead;
	}

	public void setRtbLead(String rtbLead) {
		this.rtbLead = rtbLead;
	}

	public Boolean getIsPrimary() {
		return isPrimary;
	}

	public void setIsPrimary(Boolean isPrimary) {
		this.isPrimary = isPrimary;
	}

	public String getJavaLocation() {
		return javaLocation;
	}

	public void setJavaLocation(String javaLocation) {
		this.javaLocation = javaLocation;
	}

	public String getJavaClass() {
		return javaClass;
	}

	public void setJavaClass(String javaClass) {
		this.javaClass = javaClass;
	}

	public String getFileVersion() {
		return fileVersion;
	}

	public void setFileVersion(String fileVersion) {
		this.fileVersion = fileVersion;
	}

	public int getJavaVersion() {
		return javaVersion;
	}

	public void setJavaVersion(int javaVersion) {
		this.javaVersion = javaVersion;
	}

	public String getJavaType() {
		return javaType;
	}

	public void setJavaType(String javaType) {
		this.javaType = javaType;
	}

	public String getPbtCiName() {
		return pbtCiName;
	}

	public void setPbtCiName(String pbtCiName) {
		this.pbtCiName = pbtCiName;
	}

	public Date getCommandLastExecuted() {
		return commandLastExecuted;
	}

	public void setCommandLastExecuted(Date commandLastExecuted) {
		this.commandLastExecuted = commandLastExecuted;
	}

	public String getDormancy() {
		return dormancy;
	}

	public void setDormancy(String dormancy) {
		this.dormancy = dormancy;
	}

	public int getLowCritCount() {
		return lowCritCount;
	}

	public void setLowCritCount(int lowCritCount) {
		this.lowCritCount = lowCritCount;
	}

	public int getMedCritCount() {
		return medCritCount;
	}

	public void setMedCritCount(int medCritCount) {
		this.medCritCount = medCritCount;
	}

	public int getHighCritCount() {
		return highCritCount;
	}

	public void setHighCritCount(int highCritCount) {
		this.highCritCount = highCritCount;
	}

	public String getUtilityServer() {
		return utilityServer;
	}

	public void setUtilityServer(String utilityServer) {
		this.utilityServer = utilityServer;
	}

	public String getUtilityName() {
		return utilityName;
	}

	public void setUtilityName(String utilityName) {
		this.utilityName = utilityName;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getEmbeddedType() {
		return embeddedType;
	}

	public void setEmbeddedType(String embeddedType) {
		this.embeddedType = embeddedType;
	}

	public String getJavaClass2() {
		return javaClass2;
	}

	public void setJavaClass2(String javaClass2) {
		this.javaClass2 = javaClass2;
	}

	public String getSuspectedLatestJavaVersion() {
		return suspectedLatestJavaVersion;
	}

	public void setSuspectedLatestJavaVersion(String suspectedLatestJavaVersion) {
		this.suspectedLatestJavaVersion = suspectedLatestJavaVersion;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Date getProposedDate() {
		return proposedDate;
	}

	public void setProposedDate(Date proposedDate) {
		this.proposedDate = proposedDate;
	}
}
