package fr.gtm.pb_v4_avo.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import fr.gtm.pb_v4_avo.business.ClientService;
import fr.gtm.pb_v4_avo.domain.Client;

@Controller
@RequestMapping("/client")
public class ClientController {
	private static final Logger LOGGER = LoggerFactory.getLogger(ClientController.class);

	@Autowired
	ClientService clientService;

	@PostMapping("/new")
	@ResponseBody
	public Client create(@RequestBody final Client client) {
		return this.clientService.create(client);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable final Integer id) {
		this.clientService.delete(id);
	}

	@RequestMapping("/all")
	@ResponseBody
	public List<Client> getAll() {
		return this.clientService.getAll();
	}

	@RequestMapping("/{id}")
	@ResponseBody
	public Client read(@PathVariable final Integer id) {
		ClientController.LOGGER.debug("Reception webService Creation client");
		return this.clientService.read(id);
	}

	@PutMapping("/update")
	@ResponseBody
	public Client update(@RequestParam final Client client) {
		return this.clientService.update(client);
	}
}
