/*
 * JBoss, Home of Professional Open Source
 *
 * Copyright 2025 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
module org.xnio.nio.impl {
	exports org.xnio.nio;

	requires java.logging;
	requires org.xnio.api;
	requires org.jboss.logging;
	requires org.jboss.logging.annotations;
	requires org.wildfly.common;
	requires osgi.core;

	provides org.xnio.XnioProvider with org.xnio.nio.NioXnioProvider;
}
