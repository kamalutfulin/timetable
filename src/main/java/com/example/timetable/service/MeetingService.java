package com.example.timetable.service;

import com.example.timetable.dto.FreeTimeDto;
import com.example.timetable.dto.MeetingDto;
import com.example.timetable.exception.CustomMeetingException;

import java.time.LocalDateTime;

public interface MeetingService {
    MeetingDto addMeeting(MeetingDto meetingDto) throws CustomMeetingException;

    FreeTimeDto getFreeTime(LocalDateTime startBorderTime, LocalDateTime stopBorderTime);
}
