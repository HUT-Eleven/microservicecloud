package org.hut.pojo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;


@SuppressWarnings("serial")
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain=true)
@Data
public class Dept implements Serializable{

	private Long		deptno;		  //主键
	private String		dname;		  //部门名称
	private String		dbSource;	  //来自哪个数据库，因为不同服务之间的独立的，所以有可能对应的数据库是不一样的
}
