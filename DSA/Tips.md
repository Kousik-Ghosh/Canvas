Passing variable to a rucursive method whose value need to be changed, should be done as array of single index so that the actual variable gets modified not the passed on. like

            int[] counter = {0};
            dfs(root,counter);