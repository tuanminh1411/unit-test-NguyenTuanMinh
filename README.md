
# 📘 StudentAnalyzer - Java Testing Project

## 🔧 Mô tả

`StudentAnalyzer` là một lớp Java đơn giản dùng để xử lý danh sách điểm của học sinh với hai chức năng chính:

- `countExcellentStudents(List<Double> scores)`  
  → Đếm số lượng học sinh có điểm từ 8.0 đến 10.0.

- `calculateValidAverage(List<Double> scores)`  
  → Tính điểm trung bình của các giá trị hợp lệ (từ 0.0 đến 10.0).

---

## 🧪 Kiểm thử

Sử dụng **JUnit 5** để kiểm tra các trường hợp sau:

- ✅ Danh sách hợp lệ (điểm hợp lệ trong khoảng 0–10).
- ❌ Có điểm sai (nhỏ hơn 0 hoặc lớn hơn 10).
- 🕳️ Danh sách rỗng hoặc `null`.
- 🔁 Các giá trị biên: 0.0, 10.0.

---

## ▶️ Hướng dẫn chạy dự án

### Cài đặt yêu cầu:

- Java 17+
- Maven 3.6+

### Chạy kiểm thử:

```bash
mvn test
```

---

## 📈 Đo độ bao phủ kiểm thử với JaCoCo

Dùng **JaCoCo** để kiểm tra coverage – xác định bao nhiêu phần trăm mã nguồn đã được kiểm thử.

### 👉 Cách đo:

1. **Cài plugin trong `pom.xml`:**

```xml
<build>
  <plugins>
    <plugin>
      <groupId>org.jacoco</groupId>
      <artifactId>jacoco-maven-plugin</artifactId>
      <version>0.8.10</version>
      <executions>
        <execution>
          <goals>
            <goal>prepare-agent</goal>
          </goals>
        </execution>
        <execution>
          <id>report</id>
          <phase>prepare-package</phase>
          <goals>
            <goal>report</goal>
          </goals>
        </execution>
      </executions>
    </plugin>
  </plugins>
</build>
```

2. **Chạy kiểm thử và tạo báo cáo coverage:**

```bash
mvn clean verify
```

3. **Mở báo cáo coverage trong trình duyệt:**

```
target/site/jacoco/index.html
```

---

## 📊 Kết quả đo độ bao phủ kiểm thử (JaCoCo thực tế):

Hàm	                                  Line Coverage	     Branch Coverage	          Cxty	         Ghi chú
calculateValidAverage(List)	          100%	             100%	                      6	             Bao phủ đầy đủ
countScoresInExcellentRange(List)	    100%               100%	                      6	             Bao phủ đầy đủ
isValidScore(Double)	                100%	             100%	                      4	             Bao phủ đầy đủ
StudentAnalyzer()	                    100%	             n/a	                      1	             Constructor đơn giản
Tổng	                                100%	             100%	                      17	           Tốt


## 📁 Cấu trúc thư mục

```
student-analyzer/
├── pom.xml
├── README.md
├── src/
│   ├── main/java/com/mycompany/student/StudentAnalyzer.java
│   └── test/java/com/mycompany/student/StudentAnalyzerTest.java
└── target/site/jacoco/index.html  # Báo cáo coverage
```

---

## 💡 Gợi ý nâng cao

- Tích hợp CI/CD với GitHub Actions.
- Tự động kiểm tra coverage mỗi lần push.
- Hiển thị badge % coverage trên README với Codecov/Coveralls.

---



