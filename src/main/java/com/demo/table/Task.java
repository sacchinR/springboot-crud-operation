package com.demo.table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name = "demo_project")
@AllArgsConstructor
@NoArgsConstructor
public class Task {

	@Id
	@Column(name="task_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int task;

	@Column(name="task_name")
	private String taskName;

	@Column(name="task_frequency")
	private String taskFrequency;

	@Column(name="is_active")
	private String  isActive;

	@Column(name="task_business_segment")
	private String taskBusinessSegment;

	@Column(name="task_category")
	private String taskCategory;

	@Column(name="task_provenace_flag")
	private String taskProvenaceFlag;

	@Column(name="task_nature")
	private String taskNature;

	@Column(name="task_weightage_score")
	private String taskWeightageScore;

	@Column(name="task_created_by")
	private String taskCreatedBy;

	@Column(name="task_creation_timestamp")
	private Date taskCreationTimestamp;

	@Column(name="task_apporver")
	private String taskApporver;
}
