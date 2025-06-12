# XPath Practice Exercises

This file includes a collection of common XPath selectors used in UI automation testing. Each example demonstrates different types of node selection strategies in Selenium or similar frameworks.

---

## 🔹 Basic Selectors

- `//input`  
  Selects all `<input>` elements in the document.

- `//button[text()='Submit']`  
  Selects the `<button>` element with exact text "Submit".

- `//div[@id='loginForm']`  
  Selects a `<div>` element with attribute `id="loginForm"`.

---

## 🔹 Using `contains()`

- `//input[contains(@name, 'user')]`  
  Selects all `<input>` elements whose `name` attribute contains "user".

- `//div[contains(text(), 'error')]`  
  Selects all `<div>` elements that include the word "error" in their text content.

---

## 🔹 Using `starts-with()` and `ends-with()` (partial support)

- `//input[starts-with(@id, 'email')]`  
  Selects all `<input>` elements whose `id` starts with "email".

> ⚠ `ends-with()` is not supported in all XPath engines — use `contains()` as a workaround.

---

## 🔹 Hierarchical Relationships

- `//form[@id='login']//input[@type='password']`  
  Selects `<input type='password'>` inside a `<form>` with ID `login`.

- `//ul/li[1]`  
  Selects the first `<li>` item inside any `<ul>` list.

- `//div[@class='alert']//span`  
  Selects all `<span>` inside any `<div class="alert">`.

---

## 🔹 Position and Index

- `(//input)[3]`  
  Selects the third `<input>` element in the entire document.

- `//table[@id='users']//tr[2]/td[1]`  
  Selects the first `<td>` of the second row in a table with ID "users".

---

## 🔹 Axes and Advanced Usage

- `//label[@for='username']/following-sibling::input`  
  Selects the `<input>` immediately following a `<label>` for "username".

- `//input[@type='checkbox']/ancestor::div`  
  Selects the nearest ancestor `<div>` for a checkbox input.

---

## ✅ Best Practices

- Prefer unique `id` or `name` attributes when available.
- Avoid absolute paths like `/html/body/div/...`.
- Use functions like `contains()` and `starts-with()` for flexible selectors.
- Use indexes carefully – they are brittle if the DOM changes.
- Test your XPath with browser dev tools or tools like XPath Helper or ChroPath.
