# Directory Structure

This repository is professionally organized into 6 categories of Java projects.

## 📁 Project Organization

```
java-30day-challenge/
├── projects/
│   ├── basics/                 # Fundamental Java programs
│   ├── mathematics/            # Mathematical calculations & formulas
│   ├── oop/                    # Object-Oriented Programming projects
│   ├── gui/                    # GUI & Advanced projects
│   ├── design-patterns/        # Interface & Design Pattern projects
│   └── advanced/               # Reserved for future advanced projects
├── README.md                   # Main documentation
├── DIRECTORY_STRUCTURE.md      # This file
└── .gitignore                  # Git ignore rules

```

## 📂 Category Breakdown

### 1. **Basics** (`projects/basics/`)

Fundamental Java programming concepts:

- Average
- Sum
- Subtraction
- Swap
- Positive or Negative
- AM Array
- Sort
- Days of Week
- Check Answer
- Pattern1

**Skills:** Variables, loops, conditionals, arrays, basic methods

---

### 2. **Mathematics** (`projects/mathematics/`)

Mathematical and computation-focused programs:

- AM GM (Arithmetic Mean & Geometric Mean)
- Simple Interest
- Mean
- Cylinder Area Volume
- Cube
- Rectangle
- Square
- Temperature
- Carpet Calculator

**Skills:** Mathematical operations, geometry, calculations

---

### 3. **OOP** (`projects/oop/`)

Object-Oriented Programming projects:

- Bank (Banking system)
- Credit (Credit card management)
- College (Student management)
- Swimming Pool (Volume calculations)
- Burger House (Menu system)

**Skills:** Classes, objects, inheritance, encapsulation, methods

---

### 4. **GUI** (`projects/gui/`)

Graphical User Interface projects:

- Library (Book borrowing system with GUI)
- LibraryManagement (Advanced library management with forms)

**Skills:** Swing, Forms, Event handling, GUI design

---

### 5. **Design Patterns** (`projects/design-patterns/`)

Interface and design pattern implementations:

- Interface (Basic interface usage)
- InterfaceAnimal (Animal interface example)
- InterfaceAnimalMultiple (Multiple interface implementation)

**Skills:** Interfaces, abstraction, contracts, multiple inheritance

---

### 6. **Advanced** (`projects/advanced/`)

Reserved for future advanced projects (Spring, databases, etc.)

---

## 🏗️ Project Structure

Each project follows this standard IntelliJ IDEA structure:

```
ProjectName/
├── src/                        # Source files
│   └── ClassName.java
├── out/                        # Compiled output (ignored by git)
├── ProjectName.iml             # IntelliJ project file (ignored by git)
└── .idea/                      # IDE settings (ignored by git)
```

---

## 🗑️ Cleanup Done

✅ Removed root-level build artifacts (\*.class, out/ folder)
✅ Removed duplicate project files from root
✅ Updated .gitignore to properly exclude IDE and build files
✅ Organized all 35+ projects into logical categories
✅ Maintained consistent project structure across all directories

---

## 🚀 Next Steps for Further Improvement

1. **Add Maven/Gradle**: Convert projects to Maven or Gradle for dependency management
2. **Unit Tests**: Add JUnit test directories for testing
3. **Documentation**: Add individual README.md files in each project folder
4. **Naming**: Rename folders with spaces to use hyphens (e.g., "Burger House" → "burger-house")
5. **CI/CD**: Add GitHub Actions workflows for automated testing
6. **Build Script**: Create a main build script to compile all projects

---

## 📝 How to Navigate

- **Learning Path**: Start from `basics/` → `mathematics/` → `oop/` → `design-patterns/` → `gui/`
- **Looking for a specific project**: Use the category breakdown above
- **Adding new projects**: Place them in the appropriate category folder
