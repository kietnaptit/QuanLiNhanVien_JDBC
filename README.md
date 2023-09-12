# Bài tập JDBC_Quản lí nhân viên

## Công cụ chuẩn bị
* Eclipse IDE
* MySQL Server & MySQL Workbench
* MySQL JDBC Driver (Trong Folder lib)
* File database trong Folder db

## Thông tin ứng dụng

* Mỗi phòng ban DEPARTMENT(DEPT_ID, DEPT_NAME, DEPT_NO, LOCATION) có nhiều nhân viên EMPLOYEE(EMP_ID, EMP_NAME, EMP_NO, HIRE_DATE, IMAGE, JOB, SALARY, DEPT_ID, MNG_ID, GRD_ID)
* Mỗi nhân viên có một mức lương SALARY_GRADE(GRADE, HIGH_SALARY, LOW_SALARY), trong đó lương của nhân viên không được thấp hơn mức LOW_SALARY và cao hơn mức HIGH_SALARY
* Thông tin đi làm hay nghỉ của mỗi nhân viên được lưu trong bản ghi TIMEKEEPER(ID, DATE_TIME, IN_OUT, EMP_ID)


