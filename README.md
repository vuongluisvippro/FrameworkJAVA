# BasicSpringMVC Lập trình ứng dụng Web sử dụng Spring MVC[Basic programming application web using spring MVC]
# UNDERSTANDING MAVEN PROJECT TUTORIALS
![alt tag](https://github.com/luisproject/BasicSpringMVC/blob/master/StudyMaven/1.png)
# Information of Project Maven (You just create)
![alt tag](https://github.com/luisproject/BasicSpringMVC/blob/master/StudyMaven/2.png)
# Cau hinh thu vien se dung cho maven(Cau hinh maven)
- Vi du: Commons Lang » 3.0, Searching google 
![alt tag](https://github.com/luisproject/BasicSpringMVC/blob/master/StudyMaven/3.png)
![alt tag](https://github.com/luisproject/BasicSpringMVC/blob/master/StudyMaven/4.png)
- Tiep tuc la chen vao porn.xml
![alt tag](https://github.com/luisproject/BasicSpringMVC/blob/master/StudyMaven/5.png)
![alt tag](https://github.com/luisproject/BasicSpringMVC/blob/master/StudyMaven/6.png)
- Van dung dung thu nhe voi class StringUtils
![alt tag](https://github.com/luisproject/BasicSpringMVC/blob/master/StudyMaven/7.png)
- Bạn có thể thấy rõ ràng project của bạn sử dụng các thư viện nào. Vị trí của nó ở đâu trên ổ cứng.
![alt tag](https://github.com/luisproject/BasicSpringMVC/blob/master/StudyMaven/8.png)
- Bản chất ở đây chính là dịch và đóng gói Project của bạn bằng Maven:
![alt tag](https://github.com/luisproject/BasicSpringMVC/blob/master/StudyMaven/9.png)
- Giải thích nguyên tắc hoạt động của Maven
![alt tag](https://github.com/luisproject/BasicSpringMVC/blob/master/StudyMaven/10.png)
- Xem Local repository[Xem thu vien tai repository server luu o dau trong may]
![alt tag](https://github.com/luisproject/BasicSpringMVC/blob/master/StudyMaven/11.png)
- Xem GroupID and ArtifactID
![alt tag](https://github.com/luisproject/BasicSpringMVC/blob/master/StudyMaven/12.png)
###
###
# FRAMEWORK SPRING TUTORIALS
# Hình minh họa dưới đây mô tả cấu trúc của Spring Framework.
![alt tag](https://github.com/luisproject/BasicSpringMVC/blob/master/FrameworkSpring/1.png)
- IoC Container: Đây là phần quan trọng nhất và cũng là phần cơ bản, nền tảng của Spring. Nó giữ vai trò về cấu hình và quản lý lifecycle của các java object. Bài hôm nay chúng ta sẽ tìm hiểu về phần này.
- DAO, ORM, AOP, WEB: Các module này là tool hoặc là framework có sẵn được tích hợp vào Spring.
# Tạo Maven project
![alt tag](https://github.com/luisproject/BasicSpringMVC/blob/master/FrameworkSpring/2.png)
![alt tag](https://github.com/luisproject/BasicSpringMVC/blob/master/FrameworkSpring/3.png)
![alt tag](https://github.com/luisproject/BasicSpringMVC/blob/master/FrameworkSpring/4.png)
![alt tag](https://github.com/luisproject/BasicSpringMVC/blob/master/FrameworkSpring/5.png)
![alt tag](https://github.com/luisproject/BasicSpringMVC/blob/master/FrameworkSpring/6.png)
# Khai báo các thư viện Spring cơ bản
- Đây là ví dụ HelloWorld Spring, vì vậy chúng ta chỉ sử dụng thư viện Spring cơ bản (Core). Mở file pom.xml khai báo các thư viện sẽ sử dụng:
![alt tag](https://github.com/luisproject/BasicSpringMVC/blob/master/FrameworkSpring/7.png)
![alt tag](https://github.com/luisproject/BasicSpringMVC/blob/master/FrameworkSpring/8.png)
![alt tag](https://github.com/luisproject/BasicSpringMVC/blob/master/FrameworkSpring/9.png)
![alt tag](https://github.com/luisproject/BasicSpringMVC/blob/master/FrameworkSpring/10.png)
# Code Project [Structure Project Java + Maven + Spring Framework]
- Dưới đây là hình minh họa cấu trúc của project:
![alt tag](https://github.com/luisproject/BasicSpringMVC/blob/master/FrameworkSpring/11.png)
# Code demo Language and English or Vietnamese
![alt tag](https://github.com/luisproject/BasicSpringMVC/blob/master/FrameworkSpring/12.png)
# @Autowired and @Service
- @Service là một annotation, nó được sử dụng để chú thích trên một class để nói với Spring rằng class đó là một Spring BEAN. 
- @Autowired được chú thích trên một trường (field) để nói với Spring rằng hãy tiêm (inject) giá trị vào cho trường đó. Chú ý: Từ tiêm ở đây có ý giống với gán giá trị cho trường đó. 
![alt tag](https://github.com/luisproject/BasicSpringMVC/blob/master/FrameworkSpring/13.png)
# @Repository
- @Repository là một annotation, nó được sử dụng để chú thích trên một class để nói với Spring rằng class này là một Spring BEAN. 
![alt tag](https://github.com/luisproject/BasicSpringMVC/blob/master/FrameworkSpring/14.png)
# @Component and @Autowired
- @Component là một annotation, nó được chú thích trên một class để nói với Spring rằng class này là một Spring BEAN. 
- @Autowired được chú thích trên một trường (field) để nói với Spring rằng hãy tiêm (inject) giá trị vào cho trường đó. Chú ý: Từ tiêm ở đây có ý giống với gán giá trị cho trường đó.
![alt tag](https://github.com/luisproject/BasicSpringMVC/blob/master/FrameworkSpring/15.png)
- Không có sự khác biệt về cách sử dụng của @Service, @Component và @Repository, bạn sử dụng để chú thích trên các class của bạn nên phù hợp với ý nghĩa và ngữ cảnh trong ứng dụng.
# Spring @Configuration & IoC
- @Configuration là một annotation, nó được chú thích trên một class, class này sẽ định nghĩa các Spring BEAN. 
- @ComponentScan - Nói cho Spring các package để tìm kiếm các Spring BEAN khác, Spring sẽ quét (scan) các package đó để tìm kiếm.
![alt tag](https://github.com/luisproject/BasicSpringMVC/blob/master/FrameworkSpring/16.png)
# Spring BEAN
- Các Spring BEAN được tạo ra sẽ được quản lý trong Spring IoC Container (Bộ chứa Spring IoC).
![alt tag](https://github.com/luisproject/BasicSpringMVC/blob/master/FrameworkSpring/17.png)
# Spring ApplicationContext
![alt tag](https://github.com/luisproject/BasicSpringMVC/blob/master/FrameworkSpring/18.png)
# Nguyên tắc hoạt động của Spring
![alt tag](https://github.com/luisproject/BasicSpringMVC/blob/master/FrameworkSpring/19.png)
![alt tag](https://github.com/luisproject/BasicSpringMVC/blob/master/FrameworkSpring/20.png)
![alt tag](https://github.com/luisproject/BasicSpringMVC/blob/master/FrameworkSpring/21.png)
![alt tag](https://github.com/luisproject/BasicSpringMVC/blob/master/FrameworkSpring/22.png)
![alt tag](https://github.com/luisproject/BasicSpringMVC/blob/master/FrameworkSpring/23.png)
