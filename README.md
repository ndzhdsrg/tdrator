# Tdrator

**Tdrator** — простая Java-библиотека для генерации тестовых данных.

Сейчас библиотека умеет генерировать русское имя по заданному количеству символов.

## Установка

### Gradle

```gradle
dependencies {
    implementation 'ru.tdrator:tdrator:1.0.0'
}
```

## Использование

```java
import ru.tdrator.namegenerator.NameGenerator;

public class Main {
    public static void main(String[] args) {
        String name = NameGenerator.generateRussianName(5);

        System.out.println(name);
    }
}
```

## Пример результата

```text
Мария
```

## Требования

- Java 17+
- Gradle

## Статус

Проект находится в учебной разработке.