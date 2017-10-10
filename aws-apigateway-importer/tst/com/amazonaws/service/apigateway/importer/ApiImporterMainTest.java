// =========================================================================
// Copyright � 2017 T-Mobile USA, Inc.
// 
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
// =========================================================================

package com.amazonaws.service.apigateway.importer;

import org.junit.Ignore;
import org.junit.Test;

import java.net.URISyntaxException;
import java.nio.file.Paths;

public class ApiImporterMainTest {

    @Test
    @Ignore
    public void test() throws URISyntaxException {
        ApiImporterMain main = new ApiImporterMain();

        String[] args = {"--create", Paths.get(getClass().getResource("/swagger/apigateway.json").toURI()).toString()};
        main.main(args);
    }

}
