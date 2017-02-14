/*
 * Copyright 2015 Delft University of Technology
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
package nl.tudelft.graphalytics.domain.benchmark;

import nl.tudelft.graphalytics.util.UuidGenerator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wlngai on 10/14/16.
 */
public class BenchmarkExperiment {
    String id;
    String type;
    List<BenchmarkJob> jobs;

    public BenchmarkExperiment( String type) {
        this.id = UuidGenerator.getRandomUUID("e", 6);
        this.type = type;
        this.jobs = new ArrayList<>();
    }

    public BenchmarkExperiment(String id, String type) {
        this.id = id;
        this.type = type;
        this.jobs = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<BenchmarkJob> getJobs() {
        return jobs;
    }

    public void addJob(BenchmarkJob job) {
        jobs.add(job);
    }
}
