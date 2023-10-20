// src/routes/todoRoutes.js

const express = require('express');
const router = express.Router();
const TodoController = require('../controllers/todoController');

function setTodoRoutes() {
  const todoController = new TodoController();

  router.get('/', todoController.getTodos);
  router.post('/', todoController.createTodo);
  router.put('/:id', todoController.updateTodo);
  router.delete('/:id', todoController.deleteTodo);

  return router;
}

module.exports = setTodoRoutes;