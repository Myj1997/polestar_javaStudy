package com.polestar.thread;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.polestar.excel.IExcel;

import java.time.LocalDateTime;

@JsonInclude(JsonInclude.Include.NON_NULL) // null 은 json 에 표시 안되게
public class Study implements IExcel {

    private String studyUid;
    private String seriesNumber;
    private LocalDateTime seriesDateTime;
    private String seriesdesc;
    private String modality;
    private String bodypart;
    private String section;
    private String patientId;
    private String patientName;
    private String Sex;
    private String birthday;
    private String accessionNo;
    private String WorkcompanyName;
    private String aeTitle;
    private String physicianComment;
    private String seriesInstanceUid;
    private String seriesComment;
    private String imageNumber;

    public Study() {
    }

    public String getStudyUid() {
        return studyUid;
    }

    public void setStudyUid(String studyUid) {
        this.studyUid = studyUid;
    }

    public String getSeriesNumber() {
        return seriesNumber;
    }

    public void setSeriesNumber(String seriesNumber) {
        this.seriesNumber = seriesNumber;
    }

    public LocalDateTime getSeriesDateTime() {
        return seriesDateTime;
    }

    public void setSeriesDateTime(LocalDateTime seriesDateTime) {
        this.seriesDateTime = seriesDateTime;
    }

    public String getSeriesdesc() {
        return seriesdesc;
    }

    public void setSeriesdesc(String seriesdesc) {
        this.seriesdesc = seriesdesc;
    }

    public String getModality() {
        return modality;
    }

    public void setModality(String modality) {
        this.modality = modality;
    }

    public String getBodypart() {
        return bodypart;
    }

    public void setBodypart(String bodypart) {
        this.bodypart = bodypart;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAccessionNo() {
        return accessionNo;
    }

    public void setAccessionNo(String accessionNo) {
        this.accessionNo = accessionNo;
    }

    public String getWorkcompanyName() {
        return WorkcompanyName;
    }

    public void setWorkcompanyName(String workcompanyName) {
        WorkcompanyName = workcompanyName;
    }

    public String getAeTitle() {
        return aeTitle;
    }

    public void setAeTitle(String aeTitle) {
        this.aeTitle = aeTitle;
    }

    public String getPhysicianComment() {
        return physicianComment;
    }

    public void setPhysicianComment(String physicianComment) {
        this.physicianComment = physicianComment;
    }

    public String getSeriesInstanceUid() {
        return seriesInstanceUid;
    }

    public void setSeriesInstanceUid(String seriesInstanceUid) {
        this.seriesInstanceUid = seriesInstanceUid;
    }

    public String getSeriesComment() {
        return seriesComment;
    }

    public void setSeriesComment(String seriesComment) {
        this.seriesComment = seriesComment;
    }

    public String getImageNumber() {
        return imageNumber;
    }

    public void setImageNumber(String imageNumber) {
        this.imageNumber = imageNumber;
    }

    @Override
    public String toString() {
        return "Study{" +
                "patientId='" + patientId + '\'' +
                ", patientName='" + patientName + '\'' +
                '}';
    }

    // 오브젝트를 리턴하는 방법도 있지만 추천하지않는다.
    @Override
    public String getValue(String key) {
        if ("patientId".equals(key)){

            return getPatientId();
        } else if ("patientName".equals(key)){

            return getPatientName();
        }
        // 코드 정리 & github 올림 & 퍼블릭 변경 & 이메일로 보냄

        return "X";
    }
}
