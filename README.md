# Java Spring Boot Learning Repository 

A comprehensive learning repository containing Java Spring Boot projects, Servlet examples, JDBC implementation, JPA, and Hibernate demonstrations.

## 📚 About This Repository

This repository is a collection of beginner-friendly Java backend development projects, focusing on:
- **Spring Framework** fundamentals and Dependency Injection (DI)
- **Servlet** programming and HTTP methods (GET/POST)
- **JDBC** database connectivity
- **JPA (Java Persistence API)** with Hibernate ORM
- **Spring Data JPA** CRUD operations
- **Spring JDBC** wrapper

Perfect for learning Java backend development from scratch!

---

## 📂 Repository Structure

```
java.spring_boot/
├── in.sp.DI1/                          # Dependency Injection examples
├── in.sp.DI2/                          # Constructor-based DI
├── in.sp.DI3/                          # Setter-based DI
├── src/main/java/program1/             # Basic Servlet examples
├── jdbcdemo6/                          # JDBC batch operations
├── spring_notes/
│   ├── servlet/                        # Servlet GET/POST examples
│   ├── spring jdbc/                    # Spring JDBC implementation
│   ├── hibernate/                      # Hibernate ORM examples
│   ├── jpa/                            # JPA (Insert, Select, Update, Delete)
│   └── Spring data JPA/                # Spring Data JPA CRUD operations
├── HibernateDemo1/                     # Hibernate configuration examples
└── README.md
```

---

## 🎯 Key Topics Covered

### 1. **Spring Dependency Injection (DI)**
- XML-based configuration
- Constructor injection
- Setter injection
- ApplicationContext and IoC container

**Location:** `in.sp.DI1/`, `in.sp.DI2/`, `in.sp.DI3/`

### 2. **Servlet Programming**
- HTTP GET and POST methods
- Form handling
- ServletContext
- Request/Response handling

**Location:** `src/main/java/program1/`, `spring_notes/servlet/`

### 3. **JDBC Database Connectivity**
- Connection management
- PreparedStatement usage
- Batch operations
- INSERT, SELECT, UPDATE operations

**Location:** `jdbcdemo6/`, `spring_notes/spring jdbc/`

### 4. **JPA (Java Persistence API)**
- Entity mapping
- CRUD operations
- EntityManager usage
- Persistence XML configuration

**Location:** `spring_notes/jpa/`

**Included Examples:**
- JpaProgram1Xml - Basic XML configuration
- JpaProgram3Insert - Inserting records
- JpaProgram4Select - Selecting/Reading records
- JpaProgram5Update - Updating records

### 5. **Hibernate ORM**
- XML mapping (`student.hbm.xml`)
- Entity class configuration
- Session management
- DDL auto generation

**Location:** `spring_notes/hibernate/`, `HibernateDemo1/`

### 6. **Spring Data JPA**
- Repository pattern
- CRUD repository interface
- Simplified database operations

**Location:** `spring_notes/Spring data JPA/`

---

## 🛠️ Technologies Used

| Technology | Version | Purpose |
|-----------|---------|---------|
| **Java** | 11+ | Programming language |
| **Spring Framework** | Latest | IoC Container & DI |
| **Spring Boot** | Latest | Application framework |
| **Hibernate** | Latest | ORM |
| **MySQL** | 8.0+ | Database |
| **JDBC** | Latest | Database connectivity |
| **Jakarta Servlet** | 5.0+ | Web servlet API |

---

## ⚙️ Prerequisites

Before running these projects, ensure you have:

1. **Java Development Kit (JDK)** - 11 or higher
   ```bash
   java -version
   ```

2. **Maven** - Build tool
   ```bash
   mvn --version
   ```

3. **MySQL Server** - Database
   - Create database: `smart`, `jpa_db`, `hibernate_db`

4. **IDE** - IntelliJ IDEA or Eclipse

---

## 🚀 Getting Started

### Clone the Repository
```bash
git clone https://github.com/dewanshvishwakarma/java.spring_boot.git
cd java.spring_boot
```

### Build the Project
```bash
mvn clean install
```

### Run Individual Projects
```bash
# For Spring Boot applications
mvn spring-boot:run

# For JDBC examples
mvn exec:java -Dexec.mainClass="jdbcdemo1.DataBaseConnec"

# For JPA examples
mvn exec:java -Dexec.mainClass="in.sp.main.App"
```

---

## 📝 Database Setup

### MySQL Configuration

Create required databases:
```sql
CREATE DATABASE smart;
CREATE DATABASE jpa_db;
CREATE DATABASE hibernate_db;
```

Update database credentials in application.properties:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/smart
spring.datasource.username=root
spring.datasource.password=your_password
```

**⚠️ Security Note:** Never commit passwords! Use environment variables:
```bash
export DB_PASSWORD=your_password
```

---

## 📖 Project Examples

### Example 1: Dependency Injection
```java
// XML Configuration
<bean id="student" class="in.sp.beans.Student">
    <constructor-arg value="John"/>
    <constructor-arg value="101"/>
</bean>

// Usage
ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
Student std = context.getBean(Student.class);
```

### Example 2: JDBC Batch Operations
```java
PreparedStatement ps = con.prepareStatement("INSERT INTO student VALUES(?,?,?)");
ps.setInt(1, 101);
ps.setString(2, "Abhinav");
ps.setInt(3, 500);
ps.addBatch();

ps.setInt(1, 102);
ps.setString(2, "Arjun");
ps.setInt(3, 600);
ps.addBatch();

int[] count = ps.executeBatch();
```

### Example 3: JPA Entity
```java
@Entity
@Table(name = "std_details")
public class Student {
    @Id
    @Column(name = "std_id")
    private int id;
    
    @Column(name = "std_name")
    private String name;
    
    // Getters and setters...
}
```

---

## 🎓 Learning Path

**Beginner → Intermediate → Advanced**

1. **Week 1-2:** Spring Dependency Injection (DI)
2. **Week 3-4:** Servlet Programming & HTTP
3. **Week 5-6:** JDBC & Database connectivity
4. **Week 7-8:** JPA & Entity Mapping
5. **Week 9-10:** Hibernate ORM
6. **Week 11-12:** Spring Data JPA & Spring Boot

---

## 📚 Resources

- [Spring Framework Official Docs](https://spring.io/projects/spring-framework)
- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Hibernate ORM Guide](https://hibernate.org/orm/documentation/)
- [Java JDBC Tutorial](https://docs.oracle.com/javase/tutorial/jdbc/)
- [Jakarta Servlet Specification](https://jakarta.ee/specifications/servlet/)

---

## 🐛 Common Issues & Solutions

### Issue: `ClassNotFoundException: com.mysql.cj.jdbc.Driver`
**Solution:** Add MySQL JDBC dependency to `pom.xml`
```xml
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.33</version>
</dependency>
```

### Issue: Database connection refused
**Solution:** Ensure MySQL is running and credentials are correct
```bash
mysql -u root -p
SHOW DATABASES;
```

### Issue: `.class` files not generated
**Solution:** Clean and rebuild
```bash
mvn clean compile
```

---

## ✅ Best Practices Used

✓ Separation of concerns (Entities, DAOs, Services)
✓ Dependency Injection for loose coupling
✓ Exception handling with try-catch-finally
✓ Resource management (closing connections)
✓ Entity mapping with annotations
✓ Configuration externalization with properties files

---

## 📝 Notes for Beginners

- **Don't commit passwords!** Use `.env` files and environment variables
- **Always close database connections** to avoid resource leaks
- **Use Spring's DI container** instead of manual object creation
- **Follow naming conventions:** camelCase for variables, PascalCase for classes
- **Write meaningful commit messages** for better Git history

---

## 🤝 Contributing

This is a learning repository. Feel free to:
- Create issues for questions
- Suggest improvements
- Share better implementations

---

## 📞 Contact & Support

- **GitHub Profile:** [@dewanshvishwakarma](https://github.com/dewanshvishwakarma)
- **Email:** [Your Email]
- **Questions?** Open an issue or check the project wikis

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

---

## 🎉 Acknowledgments

Special thanks to:
- Spring Framework & Spring Boot documentation
- Hibernate ORM community
- Java community resources

---

**Happy Learning! 🚀**

*Last updated: September 29, 2026*
