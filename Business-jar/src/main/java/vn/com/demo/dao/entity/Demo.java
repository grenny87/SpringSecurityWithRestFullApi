package vn.com.demo.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Demo {
	private String testId;
	private String testName;
}
