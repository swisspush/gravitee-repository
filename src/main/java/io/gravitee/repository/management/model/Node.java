/**
 * Copyright (C) 2015 The Gravitee team (http://gravitee.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.gravitee.repository.management.model;

import java.util.Date;

/**
 * @author David BRASSELY (brasseld at gmail.com)
 */
public class Node {

	/**
	 * The unique node name
	 */
    private String name;
    
    /**
     * The host where the node is running 
     */
    private String host;
    
    /**
     * Current node state
     */
    private NodeState state;
    
    /**
     * The last node start date
     */
    private Date lastStartupTime;
    
    /**
     * The last node stop date
     */
    private Date lastStopTime;
    
    /**
     * The node cluster 
     */
    private String cluster;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCluster() {
        return cluster;
    }

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

	public Date getLastStartupTime() {
		return lastStartupTime;
	}

	public void setLastStartupTime(Date lastStartupTime) {
		this.lastStartupTime = lastStartupTime;
	}

	public Date getLastStopTime() {
		return lastStopTime;
	}

	public void setLastStopTime(Date lastStopTime) {
		this.lastStopTime = lastStopTime;
	}

	public NodeState getState() {
		return state;
	}

	public void setState(NodeState state) {
		this.state = state;
	}
	

}