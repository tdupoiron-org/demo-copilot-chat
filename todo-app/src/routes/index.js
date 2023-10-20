// src/routes/index.js

const express = require('express');
const router = express.Router();
const IndexController = require('../controllers/index');
const TodoController = require('../controllers/todoController');

function setRoutes() {
  const indexController = new IndexController();
  const todoController = new TodoController();

  router.get('/', indexController.getIndex);

  router.get('/todos', todoController.getTodos);
  router.post('/todos', todoController.createTodo);
  router.get('/todos/:id', todoController.getTodo);
  router.put('/todos/:id', todoController.updateTodo);
  router.delete('/todos/:id', todoController.deleteTodo);

  return router;
}

module.exports = setRoutes;