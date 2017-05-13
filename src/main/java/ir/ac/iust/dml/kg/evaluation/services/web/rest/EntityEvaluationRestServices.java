package ir.ac.iust.dml.kg.evaluation.services.web.rest;

import io.swagger.annotations.Api;
import ir.ac.iust.dml.kg.evaluation.services.web.rest.data.SampleOutput;
import ir.ac.iust.dml.kg.search.logic.data.SearchResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/v1/evaluation/")
@Api(tags = "evaluation", description = "سرویس‌های ارزیابی")
public class EntityEvaluationRestServices {

  public EntityEvaluationRestServices() throws Exception {
  }

  @RequestMapping(value = "/hello", method = RequestMethod.GET)
  @ResponseBody
  public SampleOutput name(@RequestParam(required = true) String name) throws Exception {
    return new SampleOutput(name);
  }

  @RequestMapping(value = "/next", method = RequestMethod.GET)
  @ResponseBody
  public SearchResult next() throws Exception {
    return null;
  }
}
