package com.example.timetable.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "meeting")
public class Meeting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "userid")
    private Integer userid;

    @Column(name = "meeting_time_start")
    private LocalDateTime meetingTimeStart;

    @Column(name = "meeting_time_stop")
    private LocalDateTime meetingTimeStop;

    @Column(name = "meeting_name")
    private String meetingName;
}
