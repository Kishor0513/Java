# Project Guidelines & Best Practices

This document outlines best practices for maintaining and expanding this Java 30-day challenge repository.

## 📋 Repository Standards

### File Naming Conventions

- **Java Classes**: PascalCase (e.g., `BankAccount.java`, `LibrarySystem.java`)
- **Project Folders**: Original naming preserved for legacy reasons
- **Future Projects**: Use kebab-case (e.g., `my-calculator`, `library-system`)

### Directory Organization

```
projects/
├── basics/              # Single classes or simple multi-class programs
├── mathematics/        # Programs focused on calculations
├── oop/                # Multi-class OOP implementations
├── gui/                # Programs with Swing/GUI components
├── design-patterns/    # Interface implementations, design patterns
└── advanced/           # Complex systems, databases, etc.
```

## ✅ Project Structure Checklist

Each project should follow this structure:

- ✅ **src/ folder**: Contains all Java source files
- ✅ **Main.java**: Entry point for the program
- ✅ **Supporting classes**: Business logic in separate files
- ✅ **.iml file**: IntelliJ project file (auto-generated)
- ✅ **.idea/ folder**: IDE cache (in .gitignore)
- ✅ **out/ folder**: Compiled output (in .gitignore)

### Example Structure

```
ProjectName/
├── src/
│   ├── Main.java
│   ├── BankAccount.java
│   └── Transaction.java
├── ProjectName.iml
└── .idea/
```

## 🔍 Code Quality Standards

### Comments & Documentation

- Add JavaDoc comments for public classes and methods
- Include inline comments for complex logic
- Keep code self-documenting with clear variable names

### Example:

```java
/**
 * Calculates the simple interest for a given principal, rate, and time.
 *
 * @param principal The initial amount
 * @param rate The interest rate (annual)
 * @param time The time period in years
 * @return The calculated simple interest
 */
public static double calculateSimpleInterest(double principal, double rate, double time) {
    return (principal * rate * time) / 100;
}
```

### Exception Handling

- Use try-catch blocks for error-prone operations
- Provide meaningful error messages
- Avoid catching generic `Exception`

### Naming Standards

```
✅ Good:
- private double accountBalance;
- public void withdrawAmount(double amount)
- class BankAccount

❌ Avoid:
- private double ab;
- public void withdraw(double x)
- class BA
```

## 📦 Adding New Projects

### Steps to Add a New Project

1. **Decide on Category**: Determine which category fits best
2. **Create Project Folder**: Under appropriate category
3. **Create src/ Folder**: Add source directory
4. **Create Main.java**: Entry point file
5. **Add Supporting Classes**: Implement functionality
6. **Test Locally**: Verify it compiles and runs
7. **Commit to Git**: Push to repository

### Example Command

```bash
# Create new project structure
cd projects/oop
mkdir BankManagement
cd BankManagement
mkdir src
touch src/Main.java
touch src/BankAccount.java
```

## 🧪 Testing Your Project

### Compilation

```bash
cd projects/category/ProjectName
javac src/*.java
```

### Execution

```bash
java -cp src Main
```

### Troubleshooting

- **Import errors**: Ensure all Java files are in src/ directory
- **Main not found**: Verify Main.java exists and contains `public static void main(String[] args)`
- **Path issues**: Always run from project root directory

## 🌳 Git Workflow

### Before Committing

1. Remove build artifacts:

   ```bash
   rm -rf out/ *.class
   ```

2. Verify .gitignore is working:

   ```bash
   git status  # Should not show IDE files or build artifacts
   ```

3. Check for uncommitted changes:
   ```bash
   git diff
   ```

### Commit Messages

```
✅ Good:
- "Add Bank project with transaction management"
- "Fix: Correct calculation in SimpleInterest.java"
- "Refactor: Move utility methods to separate class"

❌ Avoid:
- "Fixed stuff"
- "Update"
- "asdf"
```

## 📚 Recommended Learning Resources

- **Java Basics**: [Oracle Java Tutorials](https://docs.oracle.com/javase/tutorial/)
- **OOP Concepts**: [GeeksforGeeks OOP](https://www.geeksforgeeks.org/object-oriented-programming-oops-concept-in-java/)
- **Design Patterns**: [Refactoring Guru - Java Design Patterns](https://refactoring.guru/design-patterns/java)
- **Swing GUI**: [Oracle Swing Tutorial](https://docs.oracle.com/javase/tutorial/uiswing/)

## 🎯 Future Improvements

### Planned Enhancements

- [ ] Add Maven/Gradle configuration for all projects
- [ ] Create JUnit test cases for each project
- [ ] Add GitHub Actions CI/CD pipeline
- [ ] Create project-specific README.md files
- [ ] Implement logging framework (Log4j)
- [ ] Add exception handling patterns throughout

### Long-term Goals

- Migrate to Spring Framework for enterprise patterns
- Add database integration (JDBC, JPA)
- Implement REST APIs with Spring Boot
- Add API documentation (Swagger/OpenAPI)

## 🤝 Contributing

When contributing to this repository:

1. Follow the structure and naming conventions above
2. Ensure code compiles without warnings
3. Test thoroughly before committing
4. Write clear commit messages
5. Keep projects self-contained and modular

## ⚠️ Common Mistakes to Avoid

1. **Mixing Java files across directories**: Keep all source in src/
2. **Committing .class files**: They're in .gitignore for a reason
3. **IDE-specific files**: Never commit .idea/ or .iml files
4. **Hardcoded paths**: Use relative paths for portability
5. **Unclear variable names**: Use descriptive naming for readability

---

**Last Updated**: May 5, 2026
**Repository**: [GitHub](https://github.com/Kishor0513/Java)
