## 项目功能梳理

项目中，我们将开发一个 AI 恋爱大师应用、一个拥有自主规划能力的超级智能体，以及一系列工具和 MCP 服务。

具体需求如下：

- AI 恋爱大师应用：用户在恋爱过程中难免遇到各种难题，让 AI 为用户提供贴心情感指导。支持多轮对话、对话记忆持久化、RAG 知识库检索、工具调用、MCP 服务调用。
- AI 超级智能体：可以根据用户的需求，自主推理和行动，直到完成目标。
- 提供给 AI 的工具：包括联网搜索、文件操作、网页抓取、资源下载、终端操作、PDF 生成。
- AI MCP 服务：可以从特定网站搜索图片。

![](https://github.com/user-attachments/assets/a2332c85-e659-412c-8d9e-b6476d98c97e)




## 用哪些技术？

项目以 Spring AI 开发框架实战为核心，涉及到多种主流 AI 客户端和工具库的运用。

- Java 21 + Spring Boot 3 框架
- ⭐️ Spring AI + LangChain4j
- ⭐️ RAG 知识库
- ⭐️ PGvector 向量数据库
- ⭐ Tool Calling 工具调用 
- ⭐️ MCP 模型上下文协议
- ⭐️ ReAct Agent 智能体构建
- ⭐️ Serverless 计算服务
- ⭐️ AI 大模型开发平台百炼
- ⭐️ Cursor AI 代码生成
- ⭐️ SSE 异步推送
- 第三方接口：如 SearchAPI / Pexels API
- Ollama 大模型部署
- 工具库如：Kryo 高性能序列化 + Jsoup 网页抓取 + iText PDF 生成 + Knife4j 接口文档


RAG 核心特性实战：

![RAG 核心特性实战](https://pic.yupi.icu/1/1745224085267-57afea3b-2de9-44a0-8f53-49e338c0e6b9.png)

项目架构设计图：

![AI 智能体架构图](https://pic.yupi.icu/1/AI%E6%99%BA%E8%83%BD%E4%BD%93%E6%9E%B6%E6%9E%84%E5%9B%BE.png)
