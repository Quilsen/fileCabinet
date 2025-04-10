# Horus - Recruitment Task - File Cabinet

This project is a solution for the recruitment task for the Junior Java Developer position at Horus.

The goal of the task was to implement a class `FileCabinet` based on provided interfaces, which allows working with a structure of folders (including nested folders).

---

## Task Description

Implement the class `FileCabinet` with the following methods:

| Method | Description |
|--------|-------------|
| `findFolderByName(String name)` | Returns any folder with a given name (Optional). |
| `findFoldersBySize(String size)` | Returns all folders with a given size: SMALL, MEDIUM, LARGE. |
| `count()` | Returns the total number of all folders (including nested ones). |

### Additional requirements:
- The structure of folders may include nested folders (interface `MultiFolder`).
- The whole logic should be inside `FileCabinet` without code duplication.
- Implementation must respect the provided interfaces:
    - `Cabinet`
    - `Folder`
    - `MultiFolder`

---

## Technologies Used

- Java 21 (Amazon Corretto)
- No frameworks - pure Java
- Project structure based on Maven

---

## Usage Example

### Running Main.java

```java
Find folder by name 'Music':
SimpleFolder{name='Music', size='MEDIUM'}

Find all folders with size MEDIUM:
MyMultiFolder{folders=[SimpleFolder{name='Docs', size='SMALL'}, SimpleFolder{name='Music', size='MEDIUM'}], name='Projects', size='MEDIUM'}
SimpleFolder{name='Music', size='MEDIUM'}

Count all folders:
6